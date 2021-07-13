/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Analytics.AnalysisHelper;
import Analytics.DataStore;
import Data.DataGenerator;
import Data.DataReader;
import java.io.IOException;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;

/**
 *
 * @author rutuja
 */
public class lab_5 {

    /**
     * @param args the command line arguments
     */
    
    DataReader commentReader;
    DataReader userReader;
    AnalysisHelper helper;
    
    public lab_5() throws IOException{
        DataGenerator generator = DataGenerator.getInstance();
        commentReader = new DataReader(generator.getCommentFilePath());
        userReader = new DataReader(generator.getUserCataloguePath());
        helper = new AnalysisHelper();
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        lab_5 inst = new lab_5();
        inst.readData();
    }

    private void readData() throws IOException {
        String[] row;
        while((row = userReader.getNextRow()) != null ){
            generateUser(row);
        }
        while((row = commentReader.getNextRow()) != null ){
            Comment comment = generateComment(row);
            generatePost(row, comment);
        }
        
        runAnalysis();
    }

    private void generateUser(String[] row) {
        int userId = Integer.parseInt(row[0]);
        User u = new User(userId, row[1], row[2]);
        DataStore.getInstance().getUsers().put(userId,u);
    }    

    private Comment generateComment(String[] row) {
        int commentId = Integer.parseInt(row[0]);
        int commentinguserId = Integer.parseInt(row[4]);
        int likes = Integer.parseInt(row[3]);
        int postId = Integer.parseInt(row[1]);
        String comment = row[5];
        Comment c = new Comment(commentId,commentinguserId, postId, comment,likes);
        DataStore.getInstance().getComments().put(commentId,c);
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        if(users.containsKey(commentinguserId))
            users.get(commentinguserId).getComments().add(c);
        return c;
    }

    private void generatePost(String[] row, Comment comment) {
        int postId = Integer.parseInt(row[1]);
        int userId = Integer.parseInt(row[2]);
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        if(posts.containsKey(postId))
            posts.get(postId).getComments().add(comment);
        else{
            Post post = new Post(postId, userId);
            post.getComments().add(comment);
            posts.put(postId, post);
        }
    }

    private void runAnalysis() {
        helper.userWithMostLikes();
        helper.getFiveMostLikedComment();
        helper.findAveNumOfLikePerComment();
        helper.postMostLikedComment();
        
        helper.mostComPost();
        helper.getFiveMostInactiveUsersByPost();
        helper.getFiveMostInactiveUsersBycomment();
        helper.getFiveMostInactiveUsersOverall();
        helper.getFiveMostProactiveUsersOverall();
    }
    }
        