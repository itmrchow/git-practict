package test;

public class myObj2 {
	int nNum = 100;

	public void setNum(int nN) {
		nNum = nN;
	}

	public int getNum() {
		return nNum;
	}

	public void printNum() {
		System.out.println(nNum);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof myObj2))
			return false;
		return this.nNum == ((myObj2) obj).getNum();
	}
}
