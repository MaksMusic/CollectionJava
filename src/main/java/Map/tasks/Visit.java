package Map.tasks;

import java.time.LocalDateTime;

public class Visit {
    private String page;
    private LocalDateTime date;

    public Visit(String page, LocalDateTime date) {
        this.page = page;
        this.date = date;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}