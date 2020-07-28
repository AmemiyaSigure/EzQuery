package cx.rain.ezquery.test.entity;

import cx.rain.ezquery.api.annontation.Entity;
import cx.rain.ezquery.api.annontation.Table;

@Entity
@Table(name = "students")
public class Students {
    public int Id;
    public String Name;
    public int Grade;
}
