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
SRC_URI[md5sum] = "c2340132ae128347a83fa8748a46ed9d"
SRC_URI[sha256sum] = "76c9ed3b5e984639909968e04c3d498c9aba36fb97e62fd5b37360b34216baf8"

# Workaround
# default_constructible_unary_fn.hpp:38:9: error: no match for 'operator==' (operand types are 'const boost::optional<std::_Bind<ActivityInfo (Activities::*(const Activities*, std::_Placeholder<1>))(const QString&) const> >' and 'int')
#CXXFLAGS += "-DBOOST_DISABLE_ASSERTS"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
	${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
