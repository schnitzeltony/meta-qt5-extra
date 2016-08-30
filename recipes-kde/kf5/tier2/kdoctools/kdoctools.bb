require ${BPN}.inc

DEPENDS += "${BPN}-native karchive ki18n libxslt libxml2"

inherit cmake-lib

SRC_URI += " \
	file://0005-set-meinproc5-executable-so-that-it-can-be-found-for.patch \
"

do_configure_append() {
    # use native docbookl10nhelper
    sed -i 's:\./docbookl10nhelper:${STAGING_BINDIR_NATIVE}/docbookl10nhelper:' ${B}/src/CMakeFiles/docbookl10nhelper.dir/build.make

    # remove build host paths
    sed -i 's:${STAGING_DIR_NATIVE}::g' ${B}/config-kdoctools.h
    sed -i 's:${STAGING_DIR_TARGET}::g' ${B}/config-kdoctools.h
}

# native binaries
CMAKE_ALIGN_SYSROOT[1] = "KF5DocTools, -s${_IMPORT_PREFIX}/bin, -S${STAGING_BINDIR_NATIVE}"

# make meinproc5 find kdoctools data
CMAKE_ALIGN_SYSROOT[2] = "KF5DocToolsMacros.cmake, -sCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE}, -SCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE} --srcdir ${STAGING_DATADIR}/kf5/kdoctools"

FILES_${PN}-dev += "${datadir}/kf5/kdoctools/customization"
