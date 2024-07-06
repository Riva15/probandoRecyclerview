package riva.ticona.superheroreapp

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var superheros: MutableList<Superhero>  = ArrayList()
    lateinit var context:Context
    //constructor

    fun RecyclerAdapter(superheros : MutableList<Superhero>, context: Context){
        this.superheros = superheros
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = superheros.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_superhero_list, parent, false))
    }
    
    override fun getItemCount(): Int {
        return superheros.size
    }
}