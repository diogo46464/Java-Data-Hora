package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class Program3 {

	public static void main(String[] args) {
		//Cálculos data-hora
		LocalDate d04 = LocalDate.parse("2024-02-19");
		LocalDateTime d05 = LocalDateTime.parse("2024-02-19T01:30:26");
		Instant d06 = Instant.parse("2024-02-19T01:30:26Z");
		
		LocalDate pasteWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate =" + pasteWeekLocalDate);
		System.out.println("nextWeekLocalDate =" + nextWeekLocalDate);
		
System.out.println("-------------");
		LocalDateTime pasteWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pasteWeekLocalDateTime = "+ pasteWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime ="+ nextWeekLocalDateTime);
		System.out.println("-------------");
		
		Instant pasteWeekInstat = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pasteWeekInstat =" + pasteWeekInstat);
		System.out.println(" nextWeekInstant=" + nextWeekInstant);
		
		System.out.println("-----------------");
		
		Duration t1 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pasteWeekLocalDateTime, d05);
		Duration t3 = Duration.between(d06,pasteWeekInstat);
		Duration t4 = Duration.between(pasteWeekInstat, d06);
				
				
				
				
		System.out.println("t1 dias =" + t1.toDays());
		System.out.println("t2 dias =" + t2.toDays());
		System.out.println("t3 dias =" + t3.toDays());
		System.out.println("t3 dias =" + t4.toDays());
		
		
		
	}

}
