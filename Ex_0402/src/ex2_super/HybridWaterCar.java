package ex2_super;

public class HybridWaterCar extends HybridCar{
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge ) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	int waterGauge;

	
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물의 량: "+waterGauge);
	}
}
