package user.process;

import user.entity.UserEntity;
import user.entity.UserEntityInterface;

// 단일 프로세스 컴포넌트라 가정 (과장님 개발)

public class UserService {

	// 외부에서 테스트용 객체를 주입할 수 있도록 UserEntityInterface 멤버변수로 선언
	private UserEntityInterface userEntity;	
	
	public void setUserEntity(UserEntityInterface userEntity) {
		this.userEntity = userEntity;
	}



	// 전체 인원수를 조회하는 메소드
	public int findAllUsersCount(){
	
		// 외부에서 테스트용 객체를 주입할 수 있도록 UserEntityInterface 멤버변수로 선언
		int count=userEntity.selectAllUserCount();
		
		if( count == 0 ){
			System.out.println("등록된 사용자가 없습니다");
		}else{
			System.out.println(count + "명이 등록되어 있습니다");
		}
		return count;
	}
	
}
