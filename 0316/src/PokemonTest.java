
public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pikachu = new Pokemon();
		pikachu = new Pokemon("피카츄",4,"물");
		
		pikachu.ShowInformation();
		
		System.out.println("-------------");
		
		Pokemon pairi = new Pokemon("파이리",4,"불");
		
		pairi.ShowInformation();
	}
}
	class Pokemon{
		String pokeName = "";
		int legs  = 0;
		String skill = "";
		
		public Pokemon() {}
		
		public Pokemon(String pokeName, int legs, String skill) {
		
			this.pokeName = pokeName;
			this.legs = legs;
			this.skill = skill;
		}
		
		public void ShowInformation() {
			System.out.println("이름 : "+pokeName);
			System.out.println("다리 갯수 : "+legs);
			System.out.println("기술 : "+skill);
		}
		
	}

