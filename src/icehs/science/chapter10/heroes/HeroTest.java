package icehs.science.chapter10.heroes;

public class HeroTest {
	
	public static void main(String[] args) {
		Hero [] heroes = {
				new SuperMan(),
				new BatMan(),
				new SpiderMan(),
			//	new Hero()  - abstract(�߻�ȭ)�� ���� ���� 
		};
		System.out.println("[Hero ���] : ���۸�, ��Ʈ��, �����̴���");
		
		for(int i = 0; i<heroes.length; i++) {
			heroes[i].action();
		}
	}
}
