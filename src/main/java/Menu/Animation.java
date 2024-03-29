package Menu;

import java.awt.Dimension;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

/**
 * A zoom effect animation.
 * 
 */
public class Animation {

    private final MenuItem item;
    private Animator animator;
    private TimingTarget target;

    public Animation(MenuItem item) {
        this.item = item;
        this.animator = new Animator(200);
        this.animator.setResolution(0);
    }

    public void mouseEnter() {
        stop();
        animator.removeTarget(target);
        target = new PropertySetter(item, "imageSize", item.getImageSize(), new Dimension(50, 50));
        animator.addTarget(target);
        animator.start();
    }

    public void mouseExit() {
        stop();
        animator.removeTarget(target);
        target = new PropertySetter(item, "imageSize", item.getImageSize(), new Dimension(35, 35));
        animator.addTarget(target);
        animator.start();
    }

    public void stop() {
        if (animator.isRunning()) {
            animator.stop();
        }
    }
}