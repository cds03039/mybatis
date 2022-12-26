package jsy.mybatais.repository.sesstion;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jsy.mybatais.model.Comment;

public class CommentSessionRepository {
	private final String namespace = "jsy.mybatais.repository.mapper.CommentMapper";

	private SqlSessionFactory getSqlSesstionFactory() {
		String resource = "orcl-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			System.out.println("db연동");
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	public Comment selectCommentByPrimaryKey(Long commentNo) {

		SqlSession sqlSession = getSqlSesstionFactory().openSession();
		System.out.println();

		try {
//			String statement = "jsy.mybatais.repository.mapper.CommentMapper.selectCommentByPrimaryKey";
			return (Comment) sqlSession.selectOne(namespace + ".selectCommentByPrimaryKey", commentNo);

		} finally {
			sqlSession.close();
		}

	}
	
	
	
	public Integer insertComment(Comment comment) {
		SqlSession sqlSession = getSqlSesstionFactory().openSession();
		try {
			String statement = namespace + ".insertComment";
			int result = sqlSession.insert(statement, comment);
			if(result > 0) {
				sqlSession.commit();
			}
			return result;
		}finally {
			sqlSession.close();
		}
	}
	
	public Integer updateComment(Comment comment) {
		SqlSession sqlSession = getSqlSesstionFactory().openSession();
		try {
			String statement = namespace + ".updateComment";
			int result = sqlSession.update(statement, comment);
			if(result > 0) {
				sqlSession.commit();
			}
			return result;
		}finally {
			sqlSession.close();
		}
	}
	
	
	public Integer deleteComment(Comment comment) {
		SqlSession sqlSession = getSqlSesstionFactory().openSession();
		try {
			String statement = namespace + ".deleteComment";
			int result = sqlSession.delete(statement, comment);
			if(result > 0) {
				sqlSession.commit();
			}
			return result;
		}finally {
			sqlSession.close();
		}
	}
}
