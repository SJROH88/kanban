package commons;

public class NotAuthorizationException extends RuntimeException{
    public NotAuthorizationException(){
        super("접근 권한이 없습니다.");
    }
}
