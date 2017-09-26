package io.vividcode.feature9.ui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MultiResolutionImageDemo {

  private static class ImageCanvas extends JComponent {

    private final String name;

    public ImageCanvas(final String name) {
      this.name = name;
    }

    @Override
    public void paint(final Graphics g) {
      final Image image = Toolkit.getDefaultToolkit()
          .getImage(
              MultiResolutionImageDemo.class
                  .getResource(String.format("/images/%s", this.name)));
      g.drawImage(image, 0, 0, this);
      g.dispose();
    }
  }

  public static void main(final String[] args) {
    final JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    final ImageCanvas canvas = new ImageCanvas("flower.png");
    canvas.setSize(700, 500);
    frame.add("Center", canvas);
    frame.setSize(700, 500);
    frame.setVisible(true);
  }
}
