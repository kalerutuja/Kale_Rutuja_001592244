/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;

/**
 *
 * @author rutuja
 */
public class AnalysisHelper {
    public void userWithMostLikes(){
        Map<Integer,Integer> userLikeCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        for(User user: users.values()){
            for(Comment c: user.getComments()){
                int likes = 0;
                if(userLikeCount.containsKey(user.getId())){
                    likes =userLikeCount.get(user.getId( ));
                }
                likes += c.getLikes();
                userLikeCount.put(user.getId(), likes);
            }
        }


        //how we find the max;
        int max = 0;
        int maxId = 0;
        for(int id : userLikeCount.keySet()){
            if(userLikeCount.get(id) > max){
                max = userLikeCount.get(id);
                maxId = id;
            }
        }

        System.out.println("User with most Likes is:" + max + "\n" + users.get(maxId));
        
    }
    
    public void getFiveMostLikedComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());

        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment c1, Comment c2) {
                return c2.getLikes() - c1.getLikes();
            }
        });

        System.out.println("5 most liked comments: ");
        for(int i=0; i<5; i++){
            System.out.println(commentList.get(i));
        }
        
    }
    public void findAveNumOfLikePerComment() {

        int average = 0;
        int total = 0;
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());
        for(int i =0; i<commentList.size();i++){
            total += commentList.get(i).getLikes();
        }
        average = total/commentList.size();

        System.out.println("Average number of likes per comment: " + average);

    }

    public void postMostLikedComment() {
        
        Map<Integer,Integer> postLikeCount = new HashMap<>();
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        for(Post post: posts.values()){
            for(Comment c: post.getComments()){
                int likes = 0;
                if(postLikeCount.containsKey(post.getPostId())){
                    likes =postLikeCount.get(post.getPostId( ));
                }
                likes += c.getLikes();
                postLikeCount.put(post.getPostId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for(int id : postLikeCount.keySet()){
            if(postLikeCount.get(id) > max){
                max = postLikeCount.get(id);
                maxId = id;
            }
        }

        System.out.println("\n Post with most liked comments is:" + max + "\n" + posts.get(maxId));

    }
    public void mostComPost(){
         int maxf = -1;
         int ans = 0;
         for (Integer tmpPostId :DataStore.getDataStore().getPosts().keySet()){
             if (DataStore.getDataStore().getPosts().get(tmpPostId).getComments().size() > maxf){
                 maxf = DataStore.getDataStore().getPosts().get(tmpPostId).getComments().size();
                 ans = tmpPostId;
             }
         }
         System.out.print("\n Post with most comment is: ");
         System.out.println(ans);
         Map<Integer, Post> tmpp = DataStore.getDataStore().getPosts();
         System.out.println(tmpp.get(ans));
    }
    
    public void getFiveMostInactiveUsersByPost(){
        int[] ans1 = {-1,-1,-1,-1,-1};
        int[] ans2 = {10000,10000,10000,10000,10000};
        
        Map<Integer,Integer> scmap=new HashMap<Integer,Integer>();
        
        for (Integer tmpUserId : DataStore.getDataStore().getUsers().keySet()){
            int score = 0;
            for (Integer tmpPostId :DataStore.getDataStore().getPosts().keySet()){
                if (DataStore.getDataStore().getPosts().get(tmpPostId).getUserId() == tmpUserId){
                    score ++;
                }
            }
            scmap.put(tmpUserId,score);
            
            
            int maxf = 0;
            for (int i = 1; i < 5; i++)
                if (ans2[i] > ans2[maxf] || (ans2[i] == ans2[maxf] && ans1[i] > ans1[maxf]))
                    maxf = i; 
            if (ans2[maxf] > score  || (ans2[maxf] == score && tmpUserId < ans1[maxf])){
                ans2[maxf] = score;
                ans1[maxf] = tmpUserId;
            }
        }
        System.out.println("\nTop 5 inactive users based on total posts number: ");
        for (int i = 0; i<5 ;i++){
            if (ans1[i] == -1) continue;
            System.out.println(DataStore.getDataStore().getUsers().get(ans1[i]) + " ");
        }
        
        List<Map.Entry<Integer,Integer>> scmapinfo = new ArrayList<Map.Entry<Integer, Integer>>(scmap.entrySet());
        Collections.sort(scmapinfo, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        
        
        System.out.println("\n*********************************************");
        System.out.println("UserId   Post");
 
        for(Map.Entry me : scmapinfo) {  
           System.out.println(me.getKey()+"        "+me.getValue());
        }  
        System.out.println("\n*********************************************");
        
        
    }
    
    public void getFiveMostInactiveUsersBycomment(){
        int[] ans1 = {-1,-1,-1,-1,-1};
        int[] ans2 = {10000,10000,10000,10000,10000};
        Map<Integer,Integer> scmap=new HashMap<Integer,Integer>();
        for (Integer tmpUserId : DataStore.getDataStore().getUsers().keySet()){
            int tmpComNum = DataStore.getDataStore().getUsers().get(tmpUserId).getComments().size();
            scmap.put(tmpUserId,tmpComNum);
            int maxf = 0;
            for (int i = 1; i < 5; i++)
                if (ans2[i] > ans2[maxf]|| (ans2[i] == ans2[maxf] && ans1[i] > ans1[maxf]))
                    maxf = i;
            if (ans2[maxf] > tmpComNum  || (ans2[maxf] == tmpComNum && tmpUserId < ans1[maxf])){
                ans2[maxf] = tmpComNum;
                ans1[maxf] = tmpUserId;
            }
        }
        System.out.println("\nTop 5 inactive users based on total comments they have created: ");
        for (int i = 0; i<5 ;i++){
            if (ans1[i] == -1) continue;
            System.out.println(DataStore.getDataStore().getUsers().get(ans1[i]) + " ");
        }
        //
        List<Map.Entry<Integer,Integer>> scmapinfo = new ArrayList<Map.Entry<Integer, Integer>>(scmap.entrySet());
        Collections.sort(scmapinfo, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        //
        System.out.println("\n*********************************************");
        System.out.println("UserID   Comments");
        for(Map.Entry me:scmapinfo){
            System.out.println(me.getKey()+"         "+me.getValue());
        }   
        System.out.println("\n*********************************************");
    }
    
    public void getFiveMostInactiveUsersOverall(){
        int[] ans1 = {-1,-1,-1,-1,-1};
        int[] ans2 = {10000,10000,10000,10000,10000};
        int[] postarr=new int[10];
        int[] commentarr=new int[10];
        int[] likearr=new int[10];
        int[] scorearr=new int[10];
        for (Integer tmpUserId : DataStore.getDataStore().getUsers().keySet()){
            User tmpUser = DataStore.getDataStore().getUsers().get(tmpUserId);
            int score = 0;
            int post=0;
            int comments=0;
            int likes=0;
            for (Integer tmpPostId :DataStore.getDataStore().getPosts().keySet()){
                Post tmpPost = DataStore.getDataStore().getPosts().get(tmpPostId);
                if (tmpPost.getUserId() == tmpUserId) {
                    score ++;
                    post++;
                    for (Comment tmpCom : tmpPost.getComments()){
                        if (tmpCom.getUserId() == tmpUserId) continue;
                        score++;
                        comments++;
                        likes=likes+tmpCom.getLikes();
                        score+=tmpCom.getLikes();
                    }
                }
            }
            for (Comment tmpCom : DataStore.getDataStore().getUsers().get(tmpUserId).getComments()){
                score ++;
                comments++;
                likes=likes+tmpCom.getLikes();
                score += tmpCom.getLikes();
            }
            //
            postarr[tmpUserId]=post;
            commentarr[tmpUserId]=comments;
            likearr[tmpUserId]=likes;
            scorearr[tmpUserId]=score;
            
            //
            int maxf = 0;
            for (int i = 1; i < 5; i++)
                if (ans2[i] > ans2[maxf]|| (ans2[i] == ans2[maxf] && ans1[i] > ans1[maxf]))
                    maxf = i;
            if (ans2[maxf] > score  || (ans2[maxf] == score && tmpUserId < ans1[maxf])){
                ans2[maxf] = score;
                ans1[maxf] = tmpUserId;
            }
            
            
            
        }
        System.out.println("\nTop 5 inactive users overall (sum of comments, posts,likes): ");
        for (int i = 0; i<5 ;i++){
            if (ans1[i] == -1) continue;
            System.out.println(DataStore.getDataStore().getUsers().get(ans1[i]) + " ");
        }
        
         //
        System.out.println("\n*********************************************");
        System.out.println("UserID   Posts   Comments   Likes     total");
        for(int i=0;i<10;i++){
            System.out.println(i+"        "+postarr[i]+"         "+commentarr[i]+"        "+likearr[i]+"      "+scorearr[i]);
        }
        System.out.println("\n*********************************************");
      
    }
    
    public void getFiveMostProactiveUsersOverall(){
        int[] ans1 = {-1,-1,-1,-1,-1};
        int[] ans2 = {0,0,0,0,0};
        for (Integer tmpUserId : DataStore.getDataStore().getUsers().keySet()){
            User tmpUser = DataStore.getDataStore().getUsers().get(tmpUserId);
            int score = 0;
            for (Integer tmpPostId :DataStore.getDataStore().getPosts().keySet()){
                Post tmpPost = DataStore.getDataStore().getPosts().get(tmpPostId);
                if (tmpPost.getUserId() == tmpUserId) {
                    score ++;
                    for (Comment tmpCom : tmpPost.getComments()){
                        if (tmpCom.getUserId() == tmpUserId) continue;
                        score++;
                        score+=tmpCom.getLikes();
                    }
                }
            }
            for (Comment tmpCom : DataStore.getDataStore().getUsers().get(tmpUserId).getComments()){
                score ++;
                score += tmpCom.getLikes();
            }
            int minf = 0;
            for (int i = 1; i < 5; i++)
                if (ans2[i] < ans2[minf]|| (ans2[i] == ans2[minf] && ans1[i] > ans1[minf]))
                    minf = i;
            if (ans2[minf] < score|| (score == ans2[minf] && tmpUserId < ans1[minf])){
                ans2[minf] = score;
                ans1[minf] = tmpUserId;
            }
        }
        System.out.println("\nTop 5 proactive users overall (sum of comments, posts,likes): ");
        for (int i = 0; i<5 ;i++){
            if (ans1[i] == -1) continue;
            System.out.println(DataStore.getDataStore().getUsers().get(ans1[i]) + " ");
        }
    }
    
}
