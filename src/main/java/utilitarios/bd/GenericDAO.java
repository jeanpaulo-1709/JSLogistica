package utilitarios.bd;

import java.util.List;

public interface GenericDAO<T>
{
	public T lerPorId(Object id);

	public List<T> lerTodos();

	public T salvar(T objeto);

	public void excluir(T objeto);

	public void abrirTransacao();

	public void gravarTransacao();

	public void desfazerTransacao();

}