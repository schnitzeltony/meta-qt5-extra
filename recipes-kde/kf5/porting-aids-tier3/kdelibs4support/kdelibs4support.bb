require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
    kauth-native \
    sonnet-native \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kdesignerplugin-native kdesignerplugin \
    networkmanager \
    qtsvg \
    qttools \
    kcompletion \
    kconfigwidgets \
    kcrash \
    kdbusaddons \
    kemoticons \
    kglobalaccel \
    kitemmodels \
    kinit \
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

do_compile:prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kdedmodule.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

do_configure:append() {
    # fix KCONFIG_COMPILER_LOCATION
    sed -i 's:${STAGING_LIBDIR_NATIVE}:${libdir}:g' ${B}/src/config-kstandarddirs.h
}

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS:${PN} += "perl"
