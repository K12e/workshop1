package Polymorphism;

class TestPoly
{
	
class SBI extends TestPoly{
	float getIfIntrest()
	{
		return 2.4f;
	}
}
	class AXIS extends TestPoly {
		float getOfIntrest()
		{
			return 5.2f;
			
		}
		}
		class ICICI extends TestPoly{
			float getofIntrest() {
				return 8.1f;
			}
		}
}
			 class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPoly b;
		b=SBI();
		System.out.println("sbi "+b.);
		b=AXIS();
		b=ICICI();
		
		
	}

	private static TestPoly ICICI() {
		// TODO Auto-generated method stub
		return null;
	}

	private static TestPoly AXIS() {
		// TODO Auto-generated method stub
		return null;
	}

	private static TestPoly SBI() {
		// TODO Auto-generated method stub
		return null;
	}

}
