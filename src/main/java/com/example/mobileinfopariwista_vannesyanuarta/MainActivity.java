package com.example.mobileinfopariwista_vannesyanuarta;

import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PariwisataAdapter pariwisataAdapter;
    private List<PariwisataModel> pariwisataList;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pariwisataList = new ArrayList<>();
        loadData();

        pariwisataAdapter = new PariwisataAdapter(pariwisataList);
        recyclerView.setAdapter(pariwisataAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                pariwisataAdapter.getFilter().filter(newText);
                return true;
            }
        });
    }

    private void loadData() {

        pariwisataList.add(new PariwisataModel(R.drawable.alun_alun_malang, "Alun-Alun Malang", "Malang, Indonesia", "Tempat rekreasi keluarga yang nyaman di pusat kota Malang.", "08:00 - 22:00", "Setiap hari", "Sangat cocok untuk keluarga dan wisatawan. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.coban_rondo, "Coban Rondo", "Malang, Indonesia", "Air terjun indah yang dikelilingi oleh hutan hijau.", "07:00 - 17:00", "Senin - Minggu", "Jangan lupa bawa jas hujan saat musim hujan. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.jatim_park_1, "Jatim Park 1", "Malang, Indonesia", "Taman bermain dan edukasi populer di Malang.", "09:00 - 18:00", "Senin - Minggu", "Tersedia wahana edukatif dan seru untuk anak-anak. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.jatim_park_2, "Jatim Park 2", "Malang, Indonesia", "Kebun binatang modern dengan wahana edukatif.", "08:30 - 17:00", "Senin - Minggu", "Ideal untuk keluarga dan pecinta satwa. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.museum_angkut, "Museum Angkut", "Malang, Indonesia", "Museum kendaraan dengan koleksi unik dari berbagai zaman.", "12:00 - 20:00", "Senin - Minggu", "Sangat cocok bagi pecinta otomotif dan sejarah. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.pantai_balekambang, "Pantai Balekambang", "Malang, Indonesia", "Pantai eksotis dengan pura di atas batu karang.", "06:00 - 18:00", "Setiap hari", "Pemandangan indah, terutama saat matahari terbenam. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.pantai_ngliyep, "Pantai Ngliyep", "Malang, Indonesia", "Pantai berpasir putih yang tenang dengan pemandangan memukau.", "06:00 - 18:00", "Setiap hari", "Cocok untuk berlibur dengan suasana tenang. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
        pariwisataList.add(new PariwisataModel(R.drawable.taman_safari, "Taman Safari", "Prigen, Indonesia", "Taman satwa dengan pengalaman safari yang seru.", "08:30 - 17:00", "Senin - Minggu", "Pengalaman interaktif melihat satwa dari dekat. Lorem Ipsum 1\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis purus euismod, sollicitudin nulla a, suscipit elit. Integer tincidunt nunc vitae turpis tincidunt, eu interdum purus facilisis. Nam vestibulum orci in sapien gravida fermentum. Fusce vel malesuada neque. Vivamus nec sollicitudin leo. Suspendisse potenti. Morbi volutpat risus ut mi facilisis, sed efficitur eros luctus. Nam sit amet dolor leo.\n" +
                "\n" +
                "Lorem Ipsum 2\n" +
                "Sed auctor dolor sit amet quam varius, ac feugiat felis vulputate. In bibendum turpis sit amet risus tincidunt, in placerat magna pretium. Integer mollis metus in metus sodales, vel aliquam nulla gravida. Curabitur sit amet lacus id dui pharetra lacinia ac eu urna. Ut interdum malesuada urna, vitae maximus ante viverra a. In hendrerit nibh in felis ullamcorper, ac tincidunt risus euismod. Suspendisse non libero quis nulla laoreet vulputate.\n" +
                "\n" +
                "Lorem Ipsum 3\n" +
                "Nullam eget ultricies neque. Etiam et neque sit amet tortor dictum feugiat ac at orci. Nam mollis scelerisque justo, id varius turpis auctor at. Nulla facilisi. Donec tincidunt, purus nec fermentum volutpat, risus purus sollicitudin augue, sit amet vehicula nulla mi vitae urna. Maecenas sit amet felis a turpis aliquam eleifend et sed ipsum. Fusce et gravida ligula. Proin placerat orci metus, id congue ipsum dictum eu.\n" +
                "\n" +
                "Lorem Ipsum 4\n" +
                "Duis ac lacus non enim suscipit posuere ac et nisi. Integer sed urna vel velit venenatis consequat at nec tortor. Aliquam euismod justo ac justo consequat, nec luctus lorem tempor. Sed sit amet lorem vel nisi accumsan tincidunt. Nam dapibus fringilla orci, a convallis libero laoreet sed. Pellentesque scelerisque ex sit amet nulla fermentum, ac bibendum odio scelerisque. Aenean lacinia erat vitae magna volutpat, ac egestas nunc gravida.\n" +
                "\n" +
                "Lorem Ipsum 5\n" +
                "Pellentesque nec varius est. Proin volutpat nunc a nisl cursus, non laoreet tortor efficitur. Quisque vehicula metus vel neque fermentum, ac iaculis lorem aliquet. Mauris non eros vel lacus efficitur lacinia. Integer pharetra euismod lacus, in consequat nunc lobortis sit amet. Integer vehicula neque et magna posuere, ut vestibulum purus malesuada. Nulla in risus a ligula sodales auctor in eget elit.\n" +
                "\n"));
    }
}
