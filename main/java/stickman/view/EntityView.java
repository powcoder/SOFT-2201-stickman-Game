https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package stickman.view;

import javafx.scene.Node;
import stickman.model.Entity;

public interface EntityView {
    void update(double xViewportOffset);

    boolean matchesEntity(Entity entity);

    void markForDelete();

    Node getNode();

    boolean isMarkedForDelete();
}
