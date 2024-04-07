package ex8_kitchen;

public class Kitchen implements Menu1,Menu2,Menu3{

	@Override
	public String jajang() {
		
		return "중면 + 춘장 + 완두콩";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "밥 + 춘장 + 계란";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "돼지고기 + 당근 + 양념";
	}

}
