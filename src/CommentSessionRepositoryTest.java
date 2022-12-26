import java.util.Calendar;
import java.util.Date;

import jsy.mybatais.model.Comment;
import jsy.mybatais.repository.sesstion.CommentSessionRepository;

public class CommentSessionRepositoryTest {

	public static void main(String[] args) {

		
		
		
		
		//select
		Long commentNo = 4L;
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = commentSessionRepository.selectCommentByPrimaryKey(commentNo);
		System.out.println(comment);
		
		
		
		
		
		//insert
		/*Long commentNo = 5L;
		String userId = "cds03038";
		Date regDate = Calendar.getInstance().getTime();
		String commentContent = "test";
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		Integer result = commentSessionRepository.insertComment(comment);
		System.out.println(result);*/
		
		
		
		//update
		/*Long commentNo = 5L;
		String commentContent = "수정 test";
		
		
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		
		comment.setCommentContent(commentContent);
		
		Integer result = commentSessionRepository.updateComment(comment);
		System.out.println(result);*/
		
		
		
		
		
		
		//delete
		/*Long commentNo = 5L;
			
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);

		Integer result = commentSessionRepository.deleteComment(comment);
		System.out.println(result);*/
		
		
		
		
		
		
	}
	
}
