SUMMARY = "A Qt wrapper library/APT implementation around the libapt-pkg library"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
"

inherit kde-base gettext

DEPENDS += " \
    xapian-core \
    apt \
    polkit-qt-1 \
"

# REVISIT optionals PACKAGECONFIG
DEPENDS += " \
    kauth \
    kauth-native \
    kconfig-native \
    kpackage-native \
    sonnet-native \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kio \
    krunner \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kiconthemes \
    libdebconf-kde \
    gstreamer1.0 \
    glib-2.0 \
"

SRC_URI[md5sum] = "638a3d8244efe0e8fa99375a5660fd3c"
SRC_URI[sha256sum] = "e0fa67518601fcde2c45aa613261022f2cfada54d3e1ea3cf0540805ba6663f3"
SRC_URI += "file://0001-include-random-for-std-default_random_engine.patch"

do_configure_append() {
    # apt sets absolute paths - we should fix that at apt...
    sed -i 's:${STAGING_LIBDIR}/::g' ${B}/CMakeFiles/Export/lib/cmake/QApt/QAptTargets.cmake
}

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/kservices5 \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
