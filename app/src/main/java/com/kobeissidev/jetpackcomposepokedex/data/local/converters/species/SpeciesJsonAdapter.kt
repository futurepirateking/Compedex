// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.kobeissidev.jetpackcomposepokedex.data.local.converters.species

import com.kobeissidev.jetpackcomposepokedex.data.model.species.*
import com.squareup.moshi.*
import com.squareup.moshi.internal.Util
import java.lang.reflect.Constructor
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public class SpeciesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Species>() {
  private val options: JsonReader.Options = JsonReader.Options.of("base_happiness", "capture_rate",
      "color", "egg_groups", "evolution_chain", "evolves_from_species", "flavor_text_entries",
      "form_descriptions", "forms_switchable", "gender_rate", "genera", "generation", "growth_rate",
      "habitat", "has_gender_differences", "hatch_counter", "id", "is_baby", "is_legendary",
      "is_mythical", "name", "names", "order", "pal_park_encounters", "pokedex_numbers", "shape",
      "varieties")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(),
      "baseHappiness")

  private val colorAdapter: JsonAdapter<Color> = moshi.adapter(Color::class.java, emptySet(),
      "color")

  private val listOfEggGroupAdapter: JsonAdapter<List<EggGroup>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, EggGroup::class.java), emptySet(),
      "eggGroups")

  private val evolutionChainAdapter: JsonAdapter<EvolutionChain> =
      moshi.adapter(EvolutionChain::class.java, emptySet(), "evolutionChain")

  private val nullableEvolutionChainAdapter: JsonAdapter<EvolutionChain?> =
      moshi.adapter(EvolutionChain::class.java, emptySet(), "evolvesFromSpecies")

  private val listOfFlavorTextEntryAdapter: JsonAdapter<List<FlavorTextEntry>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, FlavorTextEntry::class.java),
      emptySet(), "flavorTextEntries")

  private val listOfDescriptionAdapter: JsonAdapter<List<Description>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Description::class.java),
      emptySet(), "formDescriptions")

  private val booleanAdapter: JsonAdapter<Boolean> = moshi.adapter(Boolean::class.java, emptySet(),
      "formsSwitchable")

  private val listOfGeneraAdapter: JsonAdapter<List<Genera>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Genera::class.java), emptySet(),
      "genera")

  private val generationAdapter: JsonAdapter<Generation> = moshi.adapter(Generation::class.java,
      emptySet(), "generation")

  private val growthRateAdapter: JsonAdapter<GrowthRate> = moshi.adapter(GrowthRate::class.java,
      emptySet(), "growthRate")

  private val nullableHabitatAdapter: JsonAdapter<Habitat?> = moshi.adapter(Habitat::class.java,
      emptySet(), "habitat")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "name")

  private val listOfNameAdapter: JsonAdapter<List<Name>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Name::class.java), emptySet(),
      "names")

  private val listOfPalParkEncounterAdapter: JsonAdapter<List<PalParkEncounter>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, PalParkEncounter::class.java),
      emptySet(), "palParkEncounters")

  private val listOfPokedexNumberAdapter: JsonAdapter<List<PokedexNumber>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, PokedexNumber::class.java),
      emptySet(), "pokedexNumbers")

  private val shapeAdapter: JsonAdapter<Shape> = moshi.adapter(Shape::class.java, emptySet(),
      "shape")

  private val listOfVarietyAdapter: JsonAdapter<List<Variety>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Variety::class.java), emptySet(),
      "varieties")

  @Volatile
  private var constructorRef: Constructor<Species>? = null

  public override fun toString(): String = buildString(29) {
      append("GeneratedJsonAdapter(").append("Species").append(')') }

  public override fun fromJson(reader: JsonReader): Species {
    var baseHappiness: Int? = 0
    var captureRate: Int? = 0
    var color: Color? = null
    var eggGroups: List<EggGroup>? = null
    var evolutionChain: EvolutionChain? = null
    var evolvesFromSpecies: EvolutionChain? = null
    var flavorTextEntries: List<FlavorTextEntry>? = null
    var formDescriptions: List<Description>? = null
    var formsSwitchable: Boolean? = false
    var genderRate: Int? = 0
    var genera: List<Genera>? = null
    var generation: Generation? = null
    var growthRate: GrowthRate? = null
    var habitat: Habitat? = null
    var hasGenderDifferences: Boolean? = false
    var hatchCounter: Int? = 0
    var id: Int? = 0
    var isBaby: Boolean? = false
    var isLegendary: Boolean? = false
    var isMythical: Boolean? = false
    var name: String? = null
    var names: List<Name>? = null
    var order: Int? = 0
    var palParkEncounters: List<PalParkEncounter>? = null
    var pokedexNumbers: List<PokedexNumber>? = null
    var shape: Shape? = null
    var varieties: List<Variety>? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          baseHappiness = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("baseHappiness",
              "base_happiness", reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          captureRate = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("captureRate",
              "capture_rate", reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          color = colorAdapter.fromJson(reader) ?: throw Util.unexpectedNull("color", "color",
              reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          eggGroups = listOfEggGroupAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("eggGroups", "egg_groups", reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          evolutionChain = evolutionChainAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("evolutionChain", "evolution_chain", reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          evolvesFromSpecies = nullableEvolutionChainAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> {
          flavorTextEntries = listOfFlavorTextEntryAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("flavorTextEntries", "flavor_text_entries", reader)
          // $mask = $mask and (1 shl 6).inv()
          mask0 = mask0 and 0xffffffbf.toInt()
        }
        7 -> {
          formDescriptions = listOfDescriptionAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("formDescriptions", "form_descriptions", reader)
          // $mask = $mask and (1 shl 7).inv()
          mask0 = mask0 and 0xffffff7f.toInt()
        }
        8 -> {
          formsSwitchable = booleanAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("formsSwitchable", "forms_switchable", reader)
          // $mask = $mask and (1 shl 8).inv()
          mask0 = mask0 and 0xfffffeff.toInt()
        }
        9 -> {
          genderRate = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("genderRate",
              "gender_rate", reader)
          // $mask = $mask and (1 shl 9).inv()
          mask0 = mask0 and 0xfffffdff.toInt()
        }
        10 -> {
          genera = listOfGeneraAdapter.fromJson(reader) ?: throw Util.unexpectedNull("genera",
              "genera", reader)
          // $mask = $mask and (1 shl 10).inv()
          mask0 = mask0 and 0xfffffbff.toInt()
        }
        11 -> {
          generation = generationAdapter.fromJson(reader) ?: throw Util.unexpectedNull("generation",
              "generation", reader)
          // $mask = $mask and (1 shl 11).inv()
          mask0 = mask0 and 0xfffff7ff.toInt()
        }
        12 -> {
          growthRate = growthRateAdapter.fromJson(reader) ?: throw Util.unexpectedNull("growthRate",
              "growth_rate", reader)
          // $mask = $mask and (1 shl 12).inv()
          mask0 = mask0 and 0xffffefff.toInt()
        }
        13 -> {
          habitat = nullableHabitatAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 13).inv()
          mask0 = mask0 and 0xffffdfff.toInt()
        }
        14 -> {
          hasGenderDifferences = booleanAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("hasGenderDifferences", "has_gender_differences", reader)
          // $mask = $mask and (1 shl 14).inv()
          mask0 = mask0 and 0xffffbfff.toInt()
        }
        15 -> {
          hatchCounter = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("hatchCounter",
              "hatch_counter", reader)
          // $mask = $mask and (1 shl 15).inv()
          mask0 = mask0 and 0xffff7fff.toInt()
        }
        16 -> {
          id = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
          // $mask = $mask and (1 shl 16).inv()
          mask0 = mask0 and 0xfffeffff.toInt()
        }
        17 -> {
          isBaby = booleanAdapter.fromJson(reader) ?: throw Util.unexpectedNull("isBaby", "is_baby",
              reader)
          // $mask = $mask and (1 shl 17).inv()
          mask0 = mask0 and 0xfffdffff.toInt()
        }
        18 -> {
          isLegendary = booleanAdapter.fromJson(reader) ?: throw Util.unexpectedNull("isLegendary",
              "is_legendary", reader)
          // $mask = $mask and (1 shl 18).inv()
          mask0 = mask0 and 0xfffbffff.toInt()
        }
        19 -> {
          isMythical = booleanAdapter.fromJson(reader) ?: throw Util.unexpectedNull("isMythical",
              "is_mythical", reader)
          // $mask = $mask and (1 shl 19).inv()
          mask0 = mask0 and 0xfff7ffff.toInt()
        }
        20 -> {
          name = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("name", "name", reader)
          // $mask = $mask and (1 shl 20).inv()
          mask0 = mask0 and 0xffefffff.toInt()
        }
        21 -> {
          names = listOfNameAdapter.fromJson(reader) ?: throw Util.unexpectedNull("names", "names",
              reader)
          // $mask = $mask and (1 shl 21).inv()
          mask0 = mask0 and 0xffdfffff.toInt()
        }
        22 -> {
          order = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("order", "order", reader)
          // $mask = $mask and (1 shl 22).inv()
          mask0 = mask0 and 0xffbfffff.toInt()
        }
        23 -> {
          palParkEncounters = listOfPalParkEncounterAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("palParkEncounters", "pal_park_encounters", reader)
          // $mask = $mask and (1 shl 23).inv()
          mask0 = mask0 and 0xff7fffff.toInt()
        }
        24 -> {
          pokedexNumbers = listOfPokedexNumberAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("pokedexNumbers", "pokedex_numbers", reader)
          // $mask = $mask and (1 shl 24).inv()
          mask0 = mask0 and 0xfeffffff.toInt()
        }
        25 -> {
          shape = shapeAdapter.fromJson(reader) ?: throw Util.unexpectedNull("shape", "shape",
              reader)
          // $mask = $mask and (1 shl 25).inv()
          mask0 = mask0 and 0xfdffffff.toInt()
        }
        26 -> {
          varieties = listOfVarietyAdapter.fromJson(reader) ?:
              throw Util.unexpectedNull("varieties", "varieties", reader)
          // $mask = $mask and (1 shl 26).inv()
          mask0 = mask0 and 0xfbffffff.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xf8000000.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Species(
          baseHappiness = baseHappiness as Int,
          captureRate = captureRate as Int,
          color = color as Color,
          eggGroups = eggGroups as List<EggGroup>,
          evolutionChain = evolutionChain as EvolutionChain,
          evolvesFromSpecies = evolvesFromSpecies,
          flavorTextEntries = flavorTextEntries as List<FlavorTextEntry>,
          formDescriptions = formDescriptions as List<Description>,
          formsSwitchable = formsSwitchable as Boolean,
          genderRate = genderRate as Int,
          genera = genera as List<Genera>,
          generation = generation as Generation,
          growthRate = growthRate as GrowthRate,
          habitat = habitat,
          hasGenderDifferences = hasGenderDifferences as Boolean,
          hatchCounter = hatchCounter as Int,
          id = id as Int,
          isBaby = isBaby as Boolean,
          isLegendary = isLegendary as Boolean,
          isMythical = isMythical as Boolean,
          name = name as String,
          names = names as List<Name>,
          order = order as Int,
          palParkEncounters = palParkEncounters as List<PalParkEncounter>,
          pokedexNumbers = pokedexNumbers as List<PokedexNumber>,
          shape = shape as Shape,
          varieties = varieties as List<Variety>
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Species> = this.constructorRef ?:
          Species::class.java.getDeclaredConstructor(Int::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Color::class.java, List::class.java,
          EvolutionChain::class.java, EvolutionChain::class.java, List::class.java,
          List::class.java, Boolean::class.javaPrimitiveType, Int::class.javaPrimitiveType,
          List::class.java, Generation::class.java, GrowthRate::class.java, Habitat::class.java,
          Boolean::class.javaPrimitiveType, Int::class.javaPrimitiveType,
          Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType,
          Boolean::class.javaPrimitiveType, Boolean::class.javaPrimitiveType, String::class.java,
          List::class.java, Int::class.javaPrimitiveType, List::class.java, List::class.java,
          Shape::class.java, List::class.java, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          baseHappiness,
          captureRate,
          color,
          eggGroups,
          evolutionChain,
          evolvesFromSpecies,
          flavorTextEntries,
          formDescriptions,
          formsSwitchable,
          genderRate,
          genera,
          generation,
          growthRate,
          habitat,
          hasGenderDifferences,
          hatchCounter,
          id,
          isBaby,
          isLegendary,
          isMythical,
          name,
          names,
          order,
          palParkEncounters,
          pokedexNumbers,
          shape,
          varieties,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Species?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("base_happiness")
    intAdapter.toJson(writer, value_.baseHappiness)
    writer.name("capture_rate")
    intAdapter.toJson(writer, value_.captureRate)
    writer.name("color")
    colorAdapter.toJson(writer, value_.color)
    writer.name("egg_groups")
    listOfEggGroupAdapter.toJson(writer, value_.eggGroups)
    writer.name("evolution_chain")
    evolutionChainAdapter.toJson(writer, value_.evolutionChain)
    writer.name("evolves_from_species")
    nullableEvolutionChainAdapter.toJson(writer, value_.evolvesFromSpecies)
    writer.name("flavor_text_entries")
    listOfFlavorTextEntryAdapter.toJson(writer, value_.flavorTextEntries)
    writer.name("form_descriptions")
    listOfDescriptionAdapter.toJson(writer, value_.formDescriptions)
    writer.name("forms_switchable")
    booleanAdapter.toJson(writer, value_.formsSwitchable)
    writer.name("gender_rate")
    intAdapter.toJson(writer, value_.genderRate)
    writer.name("genera")
    listOfGeneraAdapter.toJson(writer, value_.genera)
    writer.name("generation")
    generationAdapter.toJson(writer, value_.generation)
    writer.name("growth_rate")
    growthRateAdapter.toJson(writer, value_.growthRate)
    writer.name("habitat")
    nullableHabitatAdapter.toJson(writer, value_.habitat)
    writer.name("has_gender_differences")
    booleanAdapter.toJson(writer, value_.hasGenderDifferences)
    writer.name("hatch_counter")
    intAdapter.toJson(writer, value_.hatchCounter)
    writer.name("id")
    intAdapter.toJson(writer, value_.id)
    writer.name("is_baby")
    booleanAdapter.toJson(writer, value_.isBaby)
    writer.name("is_legendary")
    booleanAdapter.toJson(writer, value_.isLegendary)
    writer.name("is_mythical")
    booleanAdapter.toJson(writer, value_.isMythical)
    writer.name("name")
    stringAdapter.toJson(writer, value_.name)
    writer.name("names")
    listOfNameAdapter.toJson(writer, value_.names)
    writer.name("order")
    intAdapter.toJson(writer, value_.order)
    writer.name("pal_park_encounters")
    listOfPalParkEncounterAdapter.toJson(writer, value_.palParkEncounters)
    writer.name("pokedex_numbers")
    listOfPokedexNumberAdapter.toJson(writer, value_.pokedexNumbers)
    writer.name("shape")
    shapeAdapter.toJson(writer, value_.shape)
    writer.name("varieties")
    listOfVarietyAdapter.toJson(writer, value_.varieties)
    writer.endObject()
  }
}
