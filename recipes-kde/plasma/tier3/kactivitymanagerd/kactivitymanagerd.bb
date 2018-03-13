SUMMARY = "System service to manage user's activities"
LICENSE = "GPLv2 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma gettext

DEPENDS += " \
    boost \
    kdbusaddons \
    ki18n \
    kauth-native \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    kconfig-native \
    kxmlgui \
    kwindowsystem \
    kio \
    kservice \
    kglobalaccel \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c7564b1fe91a4f111773308c40fb1110"
SRC_URI[sha256sum] = "21634b36bdcbe5826c55b9457328f13a1f405b06b4570b5ede6e61a28945b93a"
SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# Workaround
# default_constructible_unary_fn.hpp:38:9: error: no match for 'operator==' (operand types are 'const boost::optional<std::_Bind<ActivityInfo (Activities::*(const Activities*, std::_Placeholder<1>))(const QString&) const> >' and 'int')
CXXFLAGS += "-DBOOST_DISABLE_ASSERTS"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
	${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
