package corejava;

import java.lang.annotation.Documented;

/**
 * Created by Gowtham on 15-11-2017.
 */
@Documented
public @interface Detail {
    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();
}
