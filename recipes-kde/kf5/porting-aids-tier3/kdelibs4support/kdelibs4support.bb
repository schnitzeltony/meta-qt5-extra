require ${BPN}.inc

inherit cmake-lib

DEPENDS += " \
	${BPN}-native \
	qtsvg \
	qttools \
	kcompletion \
	kconfig \
	kconfigwidgets \
	kcrash \
	kdesignerplugin \
	kemoticons \
	kglobalaccel \
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
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

# uncomment for broken gelib getaddr / AI_PASSIVE
#EXTRA_OECMAKE += "-DHAVE_GOOD_GETADDRINFO=OFF"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDELibs4, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KDELibs4, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"

# native executables
CMAKE_ALIGN_SYSROOT[3] = "KF5KDELibs4Support, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"

FILES_${PN} += " \
	${datadir}/k*5 \
	${datadir}/dbus-1 \
	${libdir}/plugins \
"

FILES_${PN}-dbg += " \
	${libdir}/plugins/.debug \
	${libdir}/plugins/kf5/*/.debug \
	${libdir}/plugins/*/.debug \
"
