SUMMARY = "KSE sysguard library"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
"

inherit kde-plasma gettext

DEPENDS += " \
    libcap-native \
    qtwebengine \
    qtwebchannel \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdesignerplugin-native \
    kcoreaddons \
    kconfig \
    ki18n \
    kjobwidgets \
    kwindowsystem \
    kcompletion \
    kwidgetsaddons \
    kiconthemes \
    kconfigwidgets \
    kservice \
    kglobalaccel \
    kio \
    kdeclarative \
    knewstuff \
    zlib \
    libnl \
    libcap \
    libpcap \
    lmsensors \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxres", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "1775e1b0321b3486554a1bb49b6aa836608fb40361e3242c9281e81dac6a1fa0"

do_compile:append() {
    for cmakefile in `find ${B}/CMakeFiles/Export -name KSysGuardLibraryTargets.cmake`; do
        sed -i 's:${STAGING_DIR_HOST}${prefix}:${_IMPORT_PREFIX}:g' "$cmakefile"
    done
}

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/ksysguard \
    ${datadir}/knsrcfiles \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
