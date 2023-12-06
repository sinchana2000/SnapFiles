import { ThemeProvider } from "@/components/theme-provider"
import { Button } from "./components/ui/button"
import BasicGrid from "./components/BasicGrid"
import Login from "./components/Login"

function App() {
  return (
    <ThemeProvider defaultTheme="dark" storageKey="vite-ui-theme">
      <Login></Login>
    </ThemeProvider>
  )
}

export default App

