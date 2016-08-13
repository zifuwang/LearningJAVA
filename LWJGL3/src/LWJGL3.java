import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F7;
import static org.lwjgl.glfw.GLFW.glfwCreateWindow;
import static org.lwjgl.glfw.GLFW.glfwGetKey;
import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSetWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwShowWindow;
import static org.lwjgl.glfw.GLFW.glfwTerminate;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_TRUE;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

public class LWJGL3 {

	static public void Main() {
		if (!glfwInit()) {
			System.err.println("FAIL!");
			System.exit(1);
		}

		long win = glfwCreateWindow(640, 480, "Window", 0, 0);

		glfwShowWindow(win);
		GLFW.glfwMakeContextCurrent(win);

		GL.createCapabilities();

		glEnable(GL_TEXTURE_2D);

		float[] vertices = new float[] { -0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, -0.5f, 0,

				0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, };
		float[] texture = new float[] { 0, 0, 1, 0, 1, 1,

				1, 1, 0, 1, 0, 0 };
		Model model = new Model(vertices, texture);

		Texture tex = new Texture("./res/5.png");

		float color_red = 1;
		float color_blue = 1;
		float color_green = 0;
		float color_nred = 0;
		float color_nblue = 1;
		float color_ngreen = 1;
		float color_ored = 1;
		float color_oblue = 1;
		float color_ogreen = 1;
		float color_tred = 1;
		float color_tblue = 0;
		float color_tgreen = 1;

		while (!glfwWindowShouldClose(win)) {
			if (glfwGetKey(win, GLFW_KEY_ESCAPE) == GL_TRUE) {
				glfwSetWindowShouldClose(win, true);
			}

			glfwPollEvents();

			if (glfwGetKey(win, GLFW_KEY_F7) == GL_TRUE) {
				color_red = 0;
				color_blue = 0;
				color_green = 1;
				color_nred = 1;
				color_nblue = 0;
				color_ngreen = 0;
				color_ored = 0;
				color_oblue = 0;
				color_ogreen = 0;
				color_tred = 0;
				color_tblue = 1;
				color_tgreen = 0;
			} else {
				color_red = 1;
				color_blue = 1;
				color_green = 0;
				color_nred = 0;
				color_nblue = 1;
				color_ngreen = 1;
				color_ored = 1;
				color_oblue = 1;
				color_ogreen = 1;
				color_tred = 1;
				color_tblue = 0;
				color_tgreen = 1;

			}

			glClear(GL_COLOR_BUFFER_BIT);
			try {
				tex.bind();
			} catch (Exception e) {
				System.out.println("Stop");
			}

			model.render();

			glBegin(GL_QUADS);
			glTexCoord2f(0.0f, 0.0f);
			// glColor4f(color_red, color_blue, color_green, 0);
			glVertex2f(-0.5f, 0.5f);

			glTexCoord2f(1.0f, 0.0f);
			// glColor4f(color_nred, color_nblue, color_ngreen, 0);
			glVertex2f(0.5f, 0.5f);

			glTexCoord2f(1.0f, 1.0f);
			// glColor4f(color_ored, color_oblue, color_ogreen, 0);
			glVertex2f(0.5f, -0.5f);

			glTexCoord2f(0.0f, 1.0f);
			// glColor4f(color_tred, color_tblue, color_tgreen, 0);
			// glVertex2f(-0.5f, -0.5f);

			glEnd();

			GLFW.glfwSwapBuffers(win);
		}
		glfwTerminate();
	}

	public static void main(String[] args) {
		Main();
	}

}
