// Generated by data binding compiler. Do not edit!
package com.example.pokeapi_list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.pokeapi_list.R;
import com.example.pokeapi_list.ui.PokemonViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPokemonListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ImageView statusImage;

  @Bindable
  protected PokemonViewModel mViewModel;

  protected FragmentPokemonListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView, ImageView statusImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
    this.statusImage = statusImage;
  }

  public abstract void setViewModel(@Nullable PokemonViewModel viewModel);

  @Nullable
  public PokemonViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPokemonListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_pokemon_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPokemonListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPokemonListBinding>inflateInternal(inflater, R.layout.fragment_pokemon_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPokemonListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_pokemon_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPokemonListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPokemonListBinding>inflateInternal(inflater, R.layout.fragment_pokemon_list, null, false, component);
  }

  public static FragmentPokemonListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPokemonListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPokemonListBinding)bind(component, view, R.layout.fragment_pokemon_list);
  }
}
