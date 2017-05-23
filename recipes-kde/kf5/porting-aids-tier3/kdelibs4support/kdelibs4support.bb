require ${BPN}.inc

inherit cmake_lib gettext

DEPENDS += " \
    ${BPN}-native \
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
    kwindowsystem \
    kxmlgui \
    kded \
    kded-native \
    kauth-native \
    sonnet-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

# uncomment for broken gelib getaddr / AI_PASSIVE
#EXTRA_OECMAKE += "-DHAVE_GOOD_GETADDRINFO=OFF"

do_compile_prepend() {
    # Error: Could not locate service type file kservicetypes5/ "kdedmodule.desktop" , tried ...
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

do_configure_append() {
    # fix KCONFIG_COMPILER_LOCATION
    sed -i 's:${STAGING_LIBDIR_NATIVE}:${libdir}:g' ${B}/src/config-kstandarddirs.h
}

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5KDELibs4Support, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"
CMAKE_ALIGN_SYSROOT[2] = "KDELibs4, -s${_IMPORT_PREFIX}/bin, -S${STAGING_BINDIR_NATIVE}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
