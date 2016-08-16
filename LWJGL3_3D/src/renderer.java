import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class Rederer {

	public void prepare() {
		GL11.glClearColor(1, 1, 0, 1);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
	}

	public void render(Raw_Model model) {
		GL30.glBindVertexArray(model.getVaoid());
		GL20.glEnableVertexAttribArray(0);
		GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, model.getVertexCount());
		GL20.glDisableVertexAttribArray(0);
		GL30.glBindVertexArray(0);

	}
}