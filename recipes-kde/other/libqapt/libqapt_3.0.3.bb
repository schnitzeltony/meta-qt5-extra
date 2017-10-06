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
    kpackage \
    kpackage-native \
    libdebconf-kde \
    gstreamer1.0 \
    glib-2.0 \
"

SRC_URI[md5sum] = "58c51c9f3b7e4b36c39ed4b5127fa599"
SRC_URI[sha256sum] = "efd4ed1cfa92ed3f33d2993d4e4c508629187ada37ce1faf9368d4dc703def0a"

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
