DESCRIPTION = "headunit"
SECTION = "apps"
LICENSE = "CLOSED"

QT_BASE = " \
qtbase \
"

QT_PKGS = " \
qtdeclarative \
qtserialbus \
qtquickcontrols \
qtquickcontrols2 \
qtx11extras \
"

DEPENDS = "cmake-native \
${QT_BASE} \
${QT_PKGS} \
"

RDEPENDS:${PN} = " \
${QT_BASE} \
${QT_PKGS} \
"

SRC_URI = "git://github.com/SEA-ME-COSS/ECU-HeadUnit.git;protocol=https;nobranch=1"

SRCREV = "614553eee89561d68c4a78235fa629241ae273bf"

S = "${WORKDIR}/git"

inherit cmake_qt5
