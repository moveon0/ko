package ex2_jFrame;

import javax.swing.JFrame;

//스윙

/*
 * 보다 세련된 형태의 gui를 제공하기 위해 만들어진 ui클래스의 모음
 * 
 * - 프레임
 * JFrame
 * 프레임 객체를 만들 수 있는 클래스
 * setTitle(): 프레임의 제목
 * setBounds(x,y,width,height) : 프레임이 보여질 위치와 크기
 * setLocation : 좌표
 * setSize(width,height): 크기
 * sevVisible(boolean b) : 프레임을 보여줄지 정함
 * add(Component c) : 컴포넌트를 프레임에 붙임
 * 
 * ------------------------------------------------------------
 * -버튼
 * JButton
 * 
 * 버튼 객체를 만들 수 있는 클래스
 * 
 * 생성자
 * JButton(Icon icon) : 아이콘을 가진 버튼 생성
 * JButton(String text) : text를 가진 버튼 생성
 * 
 * 메서드
 * setBounds(x,y,width,height)
 * 
 * 이벤트처리
 * ActionListener 인터페이스에 actionPerformed() 메서드를 통해 이벤트 구현하기
 * 
 * 버튼에 이벤트 붙히기
 * addActionListener(ActionListener al);
 * 이벤트처리와 동시에 붙히기
 * addActionListener(new ActionListener(){
 * 		오버라이딩하기
 * }
 * ----------------------------------------------------------------------
 * JOptionPane 클래스
 * 
 * 사용자에게 값을 묻거나 정보를 알려주는 표준 대화 상자를 팝업을 이용해 띄운다.
 * 
 * showMessageDialog(부모 컴포넌트, 메시지, 제목, 아이콘)
 * showComfirmDialog(부모, 메시지, 제목, 아이콘, 옵션)
 * 옵션
 * DEFAULT_OPTION : 확인 버튼만 있음
 * OK_CANCEL_OPTION : OK, CANCEL 버튼
 * YES_NO_OPTION : YES OR NO
 * YES_NO_CANCEL_OPTION : YES, NO, CANCEL버튼ㄴ
 * OK -> 0
 * YES -> 0
 * NO -> 1
 * CANCEL -> 2
 * 
 * showInputDialog
 * showOptionDialog
 * ---------------------------------------------------------------------------
 * 
 * JPanel 클래스
 * 프레임과 컴포넌트들의 중간 컨테이너 역할을 한다.(뭔갈 감싸고 있는)
 * 
 * 생성자
 * JPanel() 레이아웃이 FlowLayout인 JPnel을 생성한다.
 * JPnel(LayoutManager layout) 레이아웃 매니저가 layout인 JPnel을 생성한다.
 * 
 * 배치관리자
 * FlowLayout : 왼쪽에서 오른쪽으로 배치, 오른쪽에 공간이 없으면 아래로 배치
 * BorderLayout : 동, 서, 남, 북, 중앙 다섯 개의 영역으로 나눈다.
 * GridLayout : 표 모양으로 n * n 으로 설정하며 왼쪽에서 오른쪽, 위에서 아래로 배치
 * CardLayout : 컴포넌트를 포개어 배치
 * Null : 레이아웃을 쓰지 않고 각 컴포넌트마다 수동으로 위치를 설정
 * 
 * -JPnel의 주요 메서드
 * add(Component c) : 패널에 컴포넌트 추가
 * remove(Component c) : 패널에서 컴포넌트 제거
 * setLayout(LayoutManager layout) : 배치관리자 지정
 * setbounds(x,y,width,height) : 패널의 위치와 크기 설정
 * setToolTipText(Stringtext) : 패널의 빈 곳에 마우스를 올리면 툴팁을 표시
 * 
 * 
 * -JLabel 클래스
 * 정보 또는 텍스트를 위한 라벨을 생성한다.
 * 문자열이나 아이콘을 사용하여 객체를 만든다.
 * 
 * 생성자
 * JLabel() : text와 이미지를 사용하지 않는 JLabel 생성
 * JLabel(Icon image) : image를 Icon으로 사용하는 JLabel 생성
 * JLabel(String text) : text를 사용하는 JLabel 생성
 * 
 * -JTextField
 * 
 * 한줄의 문자열을 입력할 수 있는 컴포넌트
 * 
 * 생성자
 * JTextField() : 초기 문자열이 null이고 길이가 0인 텍스트 필드
 * JTextFIeld(String next) : 초기 문자열이 text이고 길이가 0인 텍스트 필드
 * JTextField(int column) : 초기 문자열이 null이고 길이가 column인 텍스트 필드
 * JTextField(String text, int column) : 초기 문자열이 text이고 길이가 column인 텍스트필드
 * 
 * -메서드
 * String getText() : 텍스트 필드에 입력된 문자열을 구한다.
 * void setText() : 지정된 문자열을 텍스트필드에 쓴다.
 * void setEditable(boolean b) : 텍스트필드에 텍스트를 입력할 수 있는지 없는지 설정
 * boolean isEditable() : 텍스트를 입력할 수 있는지 없는지 상태를 반환
 * 
 * JTextArea
 * 여러 줄을 입력할 수 있는 컴포넌트
 * 창의 크기보다 많은 문자열을 입력하더라도 자동으로 스크롤바가 생기지 않는다.
 * 스크롤바의 기능을 사용하기 위해서는 JScroolPane클래스를 사용해야 한다.
 * 
 * - 생성자
 * JTextArea()
 * JTextArea(String text)
 * JTextArea(int row, int columns)
 * JTextArea(String text, int rows, int columns)
 * 
 * -JPasswordField
 * 입력받은 글자를 보여주지 않아야 할 때 사용
 * 
 * JPasswordField()
 * JPasswordField(String text)
 * JPasswordField(int column)
 * JPasswordField(String text, int columns)
 * 
 * -----------------------------------------------------------------------
 * 
 * JCheckBox
 * 여러 개를 클릭할 수 있는 체크박스 상자
 * 
 * JRadioButton
 * 여러 개의 라디오 버튼은 ButtonGroup을 사용하여 하나의 그룹으로 묶을 수 있다.
 * 그룹으로 묶으면 여러 개의 라디오 버튼에서 하나만 선택된다.
 * 
 * JComboBox
 * 텍스트 필드와 풀다운 리스트를 조합한 형태의 콤보 박스 기능을 제공한다.
 * 콤보 박스는 텍스트 필드에 하나의 항목만 나타내지만 마우스로 항목을 선택하면 풀다운 형태의 리스트를 제공한다.
 * 
 * 
 * -이벤트와 이벤트 처리의 개념
 * 사용자의 입력, 키보드나 마우스 등의 장치나 소프트웨어적으로 발생하는 모든 사건을 의미
 * 이벤트가 발생하면 발생된 이벤트에 반응하여 필요한 것을 처리하는 행위를 이벤트핸들러가 한다.
 * 자바에서는 이벤트 핸들러는 메서드로 구현되며, 이벤트 동작에 응답하는 방식으로
 * 처리되는 프로그램을 이벤트 지향 프로그램이라고 한다.
 * 이벤트 지향 프로그램은 무한루프를 돌면서 사용자의 이벤트가 발생하기를 기다린다.
 * 사용자의 이벤트가 발생하면 이벤트를 처리하고 무한루프로 대기한다.
 * 
 * -리스너 인터페이스를 이용한 이벤트 처리
 * 리스너 인터페이스는 이벤트와 이벤트 핸들러 사이를 연결시켜주는 역할을 한다.
 * 이벤트가 발생한 해당 컴포넌트를 리스너에 등록시켜야 프로그램의 제어가 해당 이벤트가 제공하는 이벤트 핸들러로 옮겨진다.
 * 리스너 인터페이스를 이용하여 이벤트를 처리하기 위해서는 다음과 같은 순서로 프로그램을 작성해야 한다.
 * 
 * 1. 발생하는 이벤트를 처리할 이벤트 종류 결정
 * 2. 이벤트 처리에 적합한 리스너 인터페이스를 사용하여 클래스를 작성
 * 3. 이벤트를 받아들일 각 컴포넌트에 리스너 등록
 * 4. 리스너 인터페이스에 선언된 메서드를 오버라이딩하여 이벤트 처리 루틴 작성 
 */
public class JFrameTest extends JFrame{
	public JFrameTest() {
		setTitle("제목");
		setBounds(300,300,300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameTest f = new JFrameTest();
		
	}

	
}
