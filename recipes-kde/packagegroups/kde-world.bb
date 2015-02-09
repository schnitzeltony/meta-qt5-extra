SUMMARY = "All kde packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

RDEPENDS_${PN} = "         \
    kjs \
    kunitconversion \
    kjobwidgets \
    kpackage \
    kcompletion \
    kauth \
    kpty \
    kcrash \
    kdoctools \
    ktextwidgets \
    kiconthemes \
    kemoticons \
    kio \
    knotifyconfig \
    kdewebkit \
    kcmutils \
    kwallet \
    kdesignerplugin \
    knotifications \
    kinit \
    kded \
    knewstuff \
    kactivities \
    kdesu \
    kdeclarative \
    ktexteditor \
    kglobalaccel \
    plasma-framework \
    kservice \
    kconfigwidgets \
    kbookmarks \
    kparts \
    kxmlgui \
    kfilemetadata \
    krunner \
    kdelibs4support \
    kjsembed \
    kitemmodels \
    kconfig \
    networkmanager-qt \
    kdbusaddons \
    kdnssd \
    attica \
    kimageformats \
    kidletime \
    kwindowsystem \
    sonnet \
    kplotting \
    kcoreaddons \
    kcodecs \
    threadweaver \
    kitemviews \
    ki18n \
    kguiaddons \
    solid \
    karchive \
    kwidgetsaddons \
    libksysguard \
    polkit-qt-1 \
    extra-cmake-modules \ 
    libkscreen \
    phonon \
    baloo \
    plasma-workspace \
    kdecoration \
    plasma-nm \
    breeze \
    kde-cli-tools \
    kdeplasma-addons \
    khtml \
    khelpcenter \
    kinfocenter \
    kio-extras \
    kmenuedit \
    kscreen \
    ksshaskpass \
    ksysguard \
    kwrited \
    libmm-qt \
    milou \
    muon \
    oxygen-fonts \
    oxygen \
    frameworkintegration \
    plasma-desktop \
    plasma-workspace-wallpapers \
    polkit-kde-agent-1 \
    powerdevil \
    \
    kwayland \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kwin khotkeys kde-gtk-config sddm-kcm", "",d)} \
"



