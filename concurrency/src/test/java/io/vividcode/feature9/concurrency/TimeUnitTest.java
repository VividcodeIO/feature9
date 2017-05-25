package io.vividcode.feature9.concurrency;

import org.junit.Test;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TimeUnitTest {
	@Test
	public void testChronoUnit() throws Exception {
		assertEquals(TimeUnit.MINUTES, TimeUnit.of(ChronoUnit.MINUTES));
		assertEquals(ChronoUnit.SECONDS, TimeUnit.SECONDS.toChronoUnit());
	}
}
