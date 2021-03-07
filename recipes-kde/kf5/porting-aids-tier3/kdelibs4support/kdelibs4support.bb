require ${BPN}.inc

inherit gettext

DEPENDS += " \
    ${BPN}-native \
    kdoctools-native \
    kauth-native \
    sonnet-native \
    qtsvg \
    qttools \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcrash \
    kdesignerplugin \
    kdesignerplugin-native \
    kdbusaddons \
    kemoticons \
    kglobalaccel \
    kitemmodels \
    kinit \
    kdoctools \
    kguiaddons \
    ki18n \
    kiconthemes \
    kio \
    knotifications \
    kparts \
    kservice \
    ktextwidgets \
    kunitconversion \
    kwidgetsaddons \
    kxmlgui \
    kded \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

do_compile_prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kdedmodule.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

do_configure_append() {
    # fix KCONFIG_COMPILER_LOCATION
    sed -i 's:${STAGING_LIBDIR_NATIVE}:${libdir}:g' ${B}/src/config-kstandarddirs.h
}

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "perl"
