package AdvanceJavaPractice.MujltiThread.threadPool;

import java.time.LocalDate;

public class AppointmenCenter2 {
    private LocalDate day=LocalDate.now();

    public synchronized LocalDate getAppointmentDate() {
        day = day.plusDays(1);
        return day;
    }
}
