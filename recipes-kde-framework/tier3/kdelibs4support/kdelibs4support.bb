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
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

# uncomment for broken gelib getaddr / AI_PASSIVE
#EXTRA_OECMAKE += "-DHAVE_GOOD_GETADDRINFO=OFF"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KDELibs4, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KDELibs4, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"

# native executables
CMAKE_HIDE_ERROR[3] = "KF5KDELibs4Support, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
