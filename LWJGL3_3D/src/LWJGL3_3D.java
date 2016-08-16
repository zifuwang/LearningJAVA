import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.glfwCreateWindow;
import static org.lwjgl.glfw.GLFW.glfwGetKey;
import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSetWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwShowWindow;
import static org.lwjgl.glfw.GLFW.glfwTerminate;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.opengl.GL11.GL_TRUE;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

public class LWJGL3_3D {

	static long win = 0;

	public LWJGL3_3D() {

	}

	public static void createDisplay() {
		if (!glfwInit()) {
			System.err.println("FAIL!");
			System.exit(1);
		}

		win = glfwCreateWindow(640, 480, "Window", 0, 0);

		glfwShowWindow(win);
		GLFW.glfwMakeContextCurrent(win);

		GL.createCapabilities();
	}

	public static void updateDisplay() {
		if (glfwGetKey(win, GLFW_KEY_ESCAPE) == GL_TRUE) {
			glfwSetWindowShouldClose(win, true);
		}
		glfwPollEvents();
	}

	public static void closeDisplay() {
		glfwTerminate();
	}

	static Loader loader = new Loader();
	Renderer_ Renderer = new Renderer_();

	static float[] vertices = { -0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f,

			0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f - 0.5f, 0.5f, 0f, };

	static public void Main() {
		Raw_Model model = loader.loadToVao(vertices);
		createDisplay();
		while (!glfwWindowShouldClose(win)) {
			Renderer_.prepare();
			Renderer_.render(model);
		}
	}

	public static void main(String[] args) {
		Main();
	}

}
