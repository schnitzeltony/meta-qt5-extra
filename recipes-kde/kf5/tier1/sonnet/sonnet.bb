require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native"

SRC_URI += "file://0002-core-add-valid-extra-plugin-search-path.patch"

do_configure_append() {
	# use native parsetrigrams
	sed -i 's:\./parsetrigrams:${STAGING_BINDIR_NATIVE}/parsetrigrams:' ${B}/data/CMakeFiles/trigrams_sonnet.dir/build.make
}

CMAKE_ALIGN_SYSROOT[1] = "KF5Sonnet, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Sonnet, -S${includedir}, -S${STAGING_INCDIR}"

