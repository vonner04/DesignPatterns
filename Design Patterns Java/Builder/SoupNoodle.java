
public class SoupNoodle {

	public enum NoodleType {
		WHEAT_RAMEN, RICE_VERMICELLI, BUCKWHEAT_SOBA
	}

	public enum Size {
		NORMAL, LARGE, EXTRA_LARGE
	}

	private NoodleType noodleType;
	private Size size;
	private boolean extraNoodle;
	private boolean extraVeggies;
	private boolean bambooShoots;
	private boolean egg;

	public SoupNoodle(Builder builder){
		this.noodleType = builder.noodleType;
		this.size = builder.size;
		this.extraNoodle = builder.extraNoodle;
		this.extraVeggies = builder.extraVeggies;
		this.bambooShoots = builder.bambooShoots;
		this.egg = builder.egg;
	}

	@Override
	public String toString() {
		return "SoupNoodle [noodleType=" + noodleType + ", size=" + size + ", extraNoodle=" + extraNoodle
				+ ", extraVeggies=" + extraVeggies + ", bambooShoots=" + bambooShoots + ", egg=" + egg + "]";
	}

	public static class Builder{

		private NoodleType noodleType;
		private Size size;
		private boolean extraNoodle;
		private boolean extraVeggies;
		private boolean bambooShoots;
		private boolean egg;
	
		public Builder(NoodleType noodleType, Size size){
			this.noodleType = noodleType;
			this.size = size;
		}
	
		public Builder addExtraNoodle(boolean extraNoodle){
			this.extraNoodle = extraNoodle;
			return this;
		}
	
		public Builder addExtraVeggies(boolean extraVeggies){
			this.extraVeggies = extraVeggies;
			return this;
		}
	
		public Builder addBambooShoots(boolean bambooShoots){
			this.bambooShoots = bambooShoots;
			return this;
		}
	
		public Builder addEgg(boolean egg){
			this.egg = egg;
			return this;
		}
	
		public SoupNoodle build(){
			return new SoupNoodle(this);
		}
	

}


}