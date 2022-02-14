import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NearestDistanceTest {
	@Test
	public void TestDistance()
	{
		NearestDistance fakeDistance = new NearestDistance();
		double[][] distanceArray = {{-1, 0, 3}, {-1, -1, -1}};
		int expected = 17;
		assertEquals(fakeDistance.distance(-1, 0, 3, -1, -1, -1), expected);
	}
	
}