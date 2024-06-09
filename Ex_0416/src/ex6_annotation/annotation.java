package ex6_annotation;
//어노테이션

/*
 * 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것ㄴ
 * 어노테이션은 주석처럼 프로그래밍 언어에 영향을 미치지 않으면서도
 * 다른 프로그램에게 유용한 정보를 제공할 수 있단 장점이 있다.
 * annotation의 뜻은 주석,주해,메모이다.
 * 
 * 표준어노테이션(자바에서 기본으로 제공)
 * @Override 컴파일러에게 재정의된 메서드라는 것을 알린다.
 * @Deprecated 앞으로 사용하지 않을 것을 권장하는 대상에게 붙인다.
 * @SuppressWranings 경고 무시한다.
 * @SafeVarargs (매개변수에 가변 인수를 쓸 때 발생하는 예외를 억제할 때) 경고를 무시한다. Arrays.asList(T...a) 에서 ...이 가변인수
 * @FunctionalInterface 함수형 인터페이스로 사용하겠다.
 * 
 * 메타어노테이션(어노테이션을 만들기 위한 어노테이션)
 * 스프링에서는 어노테이션으로 코드를 많이 통제한다.
 * java.lang.annotation패키지에 정의되어 있다.
 * 
 * @Target
 * 어노테이션이 적용가능한 대상을 지정하는 데 사용
 * 어노테이션을 붙일 수 있는 대상을 지정하는 것
 * 특정 필드, 메서드, 매개변수, 생성자 등등 가능
 * 여러 군데 지정 가능
 * 
 * @Retention
 * 어노테이션이 유지되는 기간을 지정하는 데 사용
 * @Retention(SOURCE): 소스코드에만 이용 가능하며 컴파일 후에는 사라짐
 * @Retention(CLASS) : 어노테이션이 .class파일에 존재하지만 런타임에는 사라짐
 * @Retention(RUNTIME) : 컴파일러와 런타임에 사용 가능
 * 
 * -어노테이션 생성 방법
 * @기호를 붙이는 것을 제외하면 인터페이스를 정의하는 것과 동일하다
 * 
 * EX) @Override의 @는 어노테이션이고 Override는 어노테이션의 '타입'이라고 한다.
 * 
 * @Interface 어노테이션,타입{
 * 
 * }

 */
public class annotation {

}