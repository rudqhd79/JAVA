package test.ch11.Annotation;

import java.lang.annotation.*;

//METHOD와 FIELD와 CONSTRUCTOR를 연동하고 싶으면 여기에 넣으면 된다
//@Target({ ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Target({ ElementType.METHOD })

//@Retention: 유지정책, 어노테이션을 언제시작해서 언제까지 유지를 할건지 지정한다
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {

	// 클래스 파일에서 값을 넘겨 받을 때
	String value() default "-"; // 아무것도 없을 때 값은 # 지금은 default로 재정의하듯 "-"

	int num() default 15; // 아무것도 없을 때 값은 20 지금은 default로 재정의하듯이 15
}
