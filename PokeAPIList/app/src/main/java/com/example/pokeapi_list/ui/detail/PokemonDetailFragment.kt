package com.example.pokeapi_list.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.pokeapi_list.R
import com.example.pokeapi_list.databinding.FragmentPokemonDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class PokemonDetailFragment : Fragment() {

    private val viewModel: DetailViewModel by activityViewModels()
    private val args: PokemonDetailFragmentArgs by navArgs() //PokemonDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPokemonDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        val toolbar = binding.toolbar
        toolbar.setNavigationIcon(R.drawable.ic_back_button)

        toolbar.setNavigationOnClickListener {
            binding.root.findNavController().navigateUp()
        }

        viewModel.onPokemonOpened(args.pokemonName)

        viewModel.pokemon.observe(this.viewLifecycleOwner, Observer { pokemon ->
            binding.apply {
                Glide.with(root).load(pokemon.sprites?.front_default).into(binding.image)
                name.text = pokemon.name?.capitalize(Locale.ROOT)
                height.text = "Height: ${pokemon.height?.div(0.1)?.toInt().toString()} cm"
                weight.text = "Weight: ${pokemon.weight.toString()} kg"
                types.text = pokemon.types?.joinToString(prefix = "Type: ",
                    separator = ", ",
                    transform = { it.type?.name.toString() })
            }
        })
        return binding.root
    }
}
