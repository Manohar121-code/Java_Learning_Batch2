package part3.collections.set;

public class Player implements Comparable<Player> {
	private int jerseyNumber;
	private String name;
	private int age;

	public Player(int jerseyNumber, String name, int age) {
		super();
		this.jerseyNumber = jerseyNumber;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + jerseyNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (jerseyNumber != other.jerseyNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [jerseyNumber=" + jerseyNumber + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Player o) {
		if (this.jerseyNumber == o.jerseyNumber) {
			return 0;
		} else if (this.jerseyNumber > o.jerseyNumber) {
			return 1;
		} else {
			return -1;
		}
	}

}
