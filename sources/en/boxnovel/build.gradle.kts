listOf("en").map { lang ->
  Extension(
    name = "BoxNovel",
    versionCode = 4,
    libVersion = "1.4",
    lang = lang,
    description = "Highest quality and scanlator-approved source",
    nsfw = false,
  )
}.also(::register)
