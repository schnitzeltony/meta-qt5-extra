require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
    docbook-xml-dtd4 \
    docbook-xsl-stylesheets \
    libxslt \
    libxml2 \
    karchive \
    ki18n \
"

inherit cmake_lib

EXTRA_OECMAKE = " \
    -DMEINPROC5_EXECUTABLE=${STAGING_DIR_NATIVE}/${bindir}/meinproc5 \
    -DDOCBOOKL10NHELPER_EXECUTABLE=${STAGING_DIR_NATIVE}/${bindir}/docbookl10nhelper \
    -DCHECKXML5_EXECUTABLE=${STAGING_DIR_NATIVE}/${bindir}/checkXML5 \
"

do_configure:append() {
    # remove build host paths
    sed -i 's:${STAGING_DIR_NATIVE}::g' ${B}/config-kdoctools.h
    sed -i 's:${STAGING_DIR_TARGET}::g' ${B}/config-kdoctools.h
}

CMAKE_ADD_ALIGN_FILES = "config-kdoctools.h"
do_install:prepend() {
    # HACK: copy all-l10n.xml from native-sysroot to our builddir
    cp -f ${STAGING_DIR_NATIVE}${datadir}/kf5/kdoctools/customization/xsl/all-l10n.xml ${B}/src/customization/xsl/
}

do_install:append() {
    # Make sure installed XML/XSL files use relative paths, otherwise they
    # will be unusable once installed in per recipe sysroot.
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/xsl/*.xml
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/*.xsl
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/dtd/kdedbx45.dtd

}

# native binaries
CMAKE_ALIGN_SYSROOT[1] = "KF5DocTools, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

FILES:${PN}-dev += "${datadir}/kf5/kdoctools/customization"
