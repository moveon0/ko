package ex6_annotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy.*;

@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Datetime {
	
	//날짜와 시간을 저장하도록 하는 메서드
	String date();
	String time();

}
