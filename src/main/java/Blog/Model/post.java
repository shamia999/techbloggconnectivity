package Blog.Model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="post")
public class post
{
@Id
@Column(name="id")

    private Integer id;
@Column(name="title")
    private String title;
@Column(name="BODY")
    private String body;
//    private Date date;
    @Transient
private Date date;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

   public Date getDate() {
       return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
