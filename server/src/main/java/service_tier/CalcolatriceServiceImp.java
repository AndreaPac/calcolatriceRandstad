package service_tier;

public class CalcolatriceServiceImp implements CalcolatriceService {

	@Override
	public int addiziona(int a, int b) {

		int r = a + b;
		return r;

	}

	@Override
	public int sottrai(int a, int b) {

		int r = a - b;
		return r;
	}

	@Override
	public int moltiplica(int a, int b) {
		int r = a * b;
		return r;
	}

	@Override
	public int dividi(int a, int b) {

		int r = a / b;
		return r;
	}

}
